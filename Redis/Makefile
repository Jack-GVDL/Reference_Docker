REDIS_PASSWORD = $(shell openssl rand -hex 10)
DEFAULT_PORT_REDIS = 55008
DEFAULT_PORT_REDIS_UI = 55009

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'REDIS_PORT=$(DEFAULT_PORT_REDIS)' >> .env
	@echo 'REDIS_PORT_UI=$(DEFAULT_PORT_REDIS_UI)' >> .env
	@echo 'REDIS_PASSWORD=$(REDIS_PASSWORD)' >> .env

up:
	docker-compose \
	--env-file .env \
	up -d

down:
	docker-compose down
