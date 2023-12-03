# credential
# username: $(MINIO_ACCESS_KEY)
# password: $(MINIO_SECRET_KEY)

MINIO_ACCESS_KEY=$(shell openssl rand -hex 20)
MINIO_SECRET_KEY=$(shell openssl rand -hex 20)
MINIO_PORT_CORE=55036
MINIO_PORT_CONSOLE=55037
MINIO_CONTAINER_NAME=Reference-Minio
PROJECT_NAME=reference_minio

all:
	@echo init
	@echo up
	@echo down

init: init-dir init-env

init-dir:
	@mkdir -p data/data
	@mkdir -p data/config

init-env:
	@rm -f .env
	@touch .env
	@echo 'MINIO_ACCESS_KEY=$(MINIO_ACCESS_KEY)' >> .env
	@echo 'MINIO_SECRET_KEY=$(MINIO_SECRET_KEY)' >> .env
	@echo 'MINIO_PORT_CORE=$(MINIO_PORT_CORE)' >> .env
	@echo 'MINIO_PORT_CONSOLE=$(MINIO_PORT_CONSOLE)' >> .env
	@echo 'MINIO_CONTAINER_NAME=$(MINIO_CONTAINER_NAME)' >> .env

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
