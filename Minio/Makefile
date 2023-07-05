# credential
# username: $(MINIO_ACCESS_KEY)
# password: $(MINIO_SECRET_KEY)

ACCESS_KEY = $(shell openssl rand -hex 20)
SECRET_KEY = $(shell openssl rand -hex 20)
PORT_CORE = 55036
PORT_CONSOLE = 55037
PROJECT_NAME = reference_minio

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
	@echo 'ACCESS_KEY=$(ACCESS_KEY)' >> .env
	@echo 'SECRET_KEY=$(SECRET_KEY)' >> .env
	@echo 'PORT_CORE=$(PORT_CORE)' >> .env
	@echo 'PORT_CONSOLE=$(PORT_CONSOLE)' >> .env

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
