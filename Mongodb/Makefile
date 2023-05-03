MONGO_USER_NAME = $(shell openssl rand -hex 10)
MONGO_PASSWORD = $(shell openssl rand -hex 10)
ADMIN_USER_NAME = $(shell openssl rand -hex 10)
ADMIN_PASSWORD = $(shell openssl rand -hex 10)
DEFAULT_PORT_MONGO = 55016
DEFAULT_PORT_ADMIN = 55017

init: init-dir init-env

init-dir:
	@mkdir -p data

init-env:
	@rm -f .env
	@touch .env
	@echo 'MONGO_USER_NAME=$(MONGO_USER_NAME)' >> .env
	@echo 'MONGO_PASSWORD=$(MONGO_PASSWORD)' >> .env
	@echo 'MONGO_ADMIN_USER_NAME=$(ADMIN_USER_NAME)' >> .env
	@echo 'MONGO_ADMIN_PASSWORD=$(ADMIN_PASSWORD)' >> .env
	@echo 'MONGO_PORT_MONGO=$(DEFAULT_PORT_MONGO)' >> .env
	@echo 'MONGO_PORT_ADMIN=$(DEFAULT_PORT_ADMIN)' >> .env

up:
	docker-compose \
	--env-file .env \
	up -d

down:
	docker-compose down
