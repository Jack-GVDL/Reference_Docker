METABASE_PORT=55023
DB_PORT=55024
METABASE_CONTAINER_NAME=Reference-Metabase
DB_CONTAINER_NAME=Reference-Metabase-Db
DB_USER=admin
DB_PASSWORD=$(shell openssl rand -hex 20)
PROJECT_NAME=reference_metabase

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -rf .env
	@touch .env
	@echo 'METABASE_PORT=$(METABASE_PORT)' >> .env
	@echo 'DB_PORT=$(DB_PORT)' >> .env
	@echo 'METABASE_CONTAINER_NAME=$(METABASE_CONTAINER_NAME)' >> .env
	@echo 'DB_CONTAINER_NAME=$(DB_CONTAINER_NAME)' >> .env
	@echo 'DB_USER=$(DB_USER)' >> .env
	@echo 'DB_PASSWORD=$(DB_PASSWORD)' >> .env

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
