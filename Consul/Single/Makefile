CONSUL_SINGLE_UI_PORT=55068
CONSUL_SINGLE_CONTAINER_NAME=Reference-Consul

PROJECT_NAME=reference_consul_single

all:
	@echo init
	@echo up
	@echo down
	@echo info

info:
	@echo Consul
	@echo 'Consul: http://localhost:${CONSUL_SINGLE_UI_PORT}'

init: init-env

init-env:
	@rm -rf .env
	@touch .env

	@echo 'CONSUL_SINGLE_UI_PORT=$(CONSUL_SINGLE_UI_PORT)' >> .env
	@echo 'CONSUL_SINGLE_CONTAINER_NAME=$(CONSUL_SINGLE_CONTAINER_NAME)' >> .env

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


