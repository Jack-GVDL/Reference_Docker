ZIPKIN_PORT=55051
ZIPKIN_CONTAINER_NAME=Reference-Zipkin
PROJECT_NAME=reference_zipkin

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'ZIPKIN_CONTAINER_NAME=$(ZIPKIN_CONTAINER_NAME)' >> .env
	@echo 'ZIPKIN_PORT=$(ZIPKIN_PORT)' >> .env

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
