FLUENTD_PORT=55052
FLUENTD_CONTAINER_NAME=Reference-Fluentd
PROJECT_NAME=reference_fluentd

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'FLUENTD_CONTAINER_NAME=$(FLUENTD_CONTAINER_NAME)' >> .env
	@echo 'FLUENTD_PORT=$(FLUENTD_PORT)' >> .env

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
