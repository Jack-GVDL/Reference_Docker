ROOT_PASSWORD=$(shell openssl rand -hex 20)
ADMIN_PASSWORD=$(shell openssl rand -hex 20)
MYSQL_PORT=55026
MYSQL_CONTAINER_NAME=Reference-Mysql
PROJECT_NAME=reference_mysql

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'MYSQL_PORT=$(MYSQL_PORT)' >> .env
	@echo 'ROOT_PASSWORD=$(ROOT_PASSWORD)' >> .env
	@echo 'ADMIN_PASSWORD=$(ADMIN_PASSWORD)' >> .env
	@echo 'MYSQL_CONTAINER_NAME=$(MYSQL_CONTAINER_NAME)' >> .env

up:
	docker compose \
	--env-file .env \
	--project-name $(PROJECT_NAME) \
	up -d

down:
	docker compose \
	--env-file .env \
	--project-name $(PROJECT_NAME) \
	down
