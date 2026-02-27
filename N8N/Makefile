N8N_PORT=5678
N8N_CONTAINER_NAME=Reference-N8N
PROJECT_NAME=reference_n8n

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'N8N_PORT=$(N8N_PORT)' >> .env
	@echo 'N8N_CONTAINER_NAME=$(N8N_CONTAINER_NAME)' >> .env

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

