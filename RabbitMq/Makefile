RABBITMQ_DEFAULT_USER=user
RABBITMQ_DEFAULT_PASSWORD=$(shell openssl rand -hex 20)
RABBITMQ_PORT_DEFAULT=55058
RABBITMQ_PORT_MANAGEMENT=55059
RABBITMQ_CONTAINER_NAME=Reference-RabbitMq
PROJECT_NAME=reference_rabbitmq

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'RABBITMQ_DEFAULT_USER=$(RABBITMQ_DEFAULT_USER)' >> .env
	@echo 'RABBITMQ_DEFAULT_PASSWORD=$(RABBITMQ_DEFAULT_PASSWORD)' >> .env
	@echo 'RABBITMQ_PORT_DEFAULT=$(RABBITMQ_PORT_DEFAULT)' >> .env
	@echo 'RABBITMQ_PORT_MANAGEMENT=$(RABBITMQ_PORT_MANAGEMENT)' >> .env
	@echo 'RABBITMQ_CONTAINER_NAME=$(RABBITMQ_CONTAINER_NAME)' >> .env

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
