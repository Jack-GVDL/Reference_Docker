ROOT_PASSWORD = $(shell openssl rand -hex 20)
ADMIN_PASSWORD = $(shell openssl rand -hex 20)
DEFAULT_PORT = 55026

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'MYSQL_PORT=$(DEFAULT_PORT)' >> .env
	@echo 'MYSQL_ROOT_PASSWORD=$(ROOT_PASSWORD)' >> .env
	@echo 'MYSQL_ADMIN_PASSWORD=$(ADMIN_PASSWORD)' >> .env

up:
	docker-compose \
	--env-file .env \
	up -d

down:
	docker-compose down
