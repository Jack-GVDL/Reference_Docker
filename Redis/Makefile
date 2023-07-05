PASSWORD = $(shell openssl rand -hex 10)
REDIS_PORT = 55008
REDIS_UI_PORT = 55009
PROJECT_NAME = reference_redis

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'REDIS_PORT=$(REDIS_PORT)' >> .env
	@echo 'REDIS_UI_PORT=$(REDIS_UI_PORT)' >> .env
	@echo 'PASSWORD=$(PASSWORD)' >> .env

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
