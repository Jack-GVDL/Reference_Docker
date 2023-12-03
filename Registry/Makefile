REGISTRY_PORT=55034
UI_PORT=55035
REGISTRY_CONTAINER_NAME=Reference-DockerRegistry
REGISTRY_UI_CONTAINER_NAME=Reference-DockerRegistry-Ui
PROJECT_NAME=reference_registry

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'REGISTRY_PORT=$(REGISTRY_PORT)' >> .env
	@echo 'REGISTRY_CONTAINER_NAME=$(REGISTRY_CONTAINER_NAME)' >> .env
	@echo 'REGISTRY_UI_CONTAINER_NAME=$(REGISTRY_UI_CONTAINER_NAME)' >> .env
	@echo 'UI_PORT=$(UI_PORT)' >> .env

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
