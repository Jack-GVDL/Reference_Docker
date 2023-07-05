USER_NAME = $(shell openssl rand -hex 10)
PASSWORD = $(shell openssl rand -hex 10)
ADMIN_USER_NAME = $(shell openssl rand -hex 10)
ADMIN_PASSWORD = $(shell openssl rand -hex 10)
PORT_MONGO = 55016
PORT_ADMIN = 55017
PROJECT_NAME = reference_mongodb

all:
	@echo init
	@echo up
	@echo down

init: init-dir init-env

init-dir:
	@mkdir -p data

init-env:
	@rm -f .env
	@touch .env
	@echo 'USER_NAME=$(USER_NAME)' >> .env
	@echo 'PASSWORD=$(PASSWORD)' >> .env
	@echo 'ADMIN_USER_NAME=$(ADMIN_USER_NAME)' >> .env
	@echo 'ADMIN_PASSWORD=$(ADMIN_PASSWORD)' >> .env
	@echo 'PORT_MONGO=$(PORT_MONGO)' >> .env
	@echo 'PORT_ADMIN=$(PORT_ADMIN)' >> .env

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
