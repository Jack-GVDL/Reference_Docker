KEYCLOAK_PORT = 55002
KEYCLOAK_USER = admin
KEYCLOAK_PASSWORD  =$(shell openssl rand -hex 20)
POSTGRES_PORT = 55001
POSTGRES_USER = admin
POSTGRES_PASSWORD  =$(shell openssl rand -hex 20)
POSTGRES_DATABASE = keycloak
PROJECT_NAME = reference_keycloak

all:
	@echo init
	@echo up
	@echo downs

init: init-env

init-env:
	@rm -rf .env
	@touch .env
	@echo 'KEYCLOAK_PORT=$(KEYCLOAK_PORT)' >> .env
	@echo 'KEYCLOAK_USER=$(KEYCLOAK_USER)' >> .env
	@echo 'KEYCLOAK_PASSWORD=$(KEYCLOAK_PASSWORD)' >> .env
	@echo 'POSTGRES_PORT=$(POSTGRES_PORT)' >> .env
	@echo 'POSTGRES_USER=$(POSTGRES_USER)' >> .env
	@echo 'POSTGRES_PASSWORD=$(POSTGRES_PASSWORD)' >> .env
	@echo 'POSTGRES_DATABASE=$(POSTGRES_DATABASE)' >> .env

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