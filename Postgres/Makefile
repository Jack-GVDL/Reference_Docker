POSTGRES_PORT=55004
POSTGRES_USER=admin
POSTGRES_PASSWORD=$(shell openssl rand -hex 20)
POSTGRES_CONTAINER_NAME=Reference-Postgres
PROJECT_NAME=reference_postgres

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -rf .env
	@touch .env
	@echo 'POSTGRES_PORT=$(POSTGRES_PORT)' >> .env
	@echo 'POSTGRES_USER=$(POSTGRES_USER)' >> .env
	@echo 'POSTGRES_PASSWORD=$(POSTGRES_PASSWORD)' >> .env
	@echo 'POSTGRES_CONTAINER_NAME=$(POSTGRES_CONTAINER_NAME)' >> .env

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
