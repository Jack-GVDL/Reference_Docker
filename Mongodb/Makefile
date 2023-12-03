MONGODB_USER_NAME=$(shell openssl rand -hex 10)
MONGODB_PASSWORD=$(shell openssl rand -hex 10)
MONGODB_ADMIN_USER_NAME=$(shell openssl rand -hex 10)
MONGODB_ADMIN_PASSWORD=$(shell openssl rand -hex 10)
MONGODB_PORT_MONGO=55016
MONGODB_PORT_ADMIN=55017
MONGODB_CONTAINER_NAME=Reference-Mongo
MONGODB_EXPRESS_CONTAINER_NAME=Reference-MongoExpress
PROJECT_NAME=reference_mongodb

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
	@echo 'MONGODB_USER_NAME=$(MONGODB_USER_NAME)' >> .env
	@echo 'MONGODB_PASSWORD=$(MONGODB_PASSWORD)' >> .env
	@echo 'MONGODB_ADMIN_USER_NAME=$(MONGODB_ADMIN_USER_NAME)' >> .env
	@echo 'MONGODB_ADMIN_PASSWORD=$(MONGODB_ADMIN_PASSWORD)' >> .env
	@echo 'MONGODB_PORT_MONGO=$(MONGODB_PORT_MONGO)' >> .env
	@echo 'MONGODB_PORT_ADMIN=$(MONGODB_PORT_ADMIN)' >> .env
	@echo 'MONGODB_CONTAINER_NAME=$(MONGODB_CONTAINER_NAME)' >> .env
	@echo 'MONGODB_EXPRESS_CONTAINER_NAME=$(MONGODB_EXPRESS_CONTAINER_NAME)' >> .env

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
