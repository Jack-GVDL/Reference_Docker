SUPERSET_PORT=55055
SUPERSET_SECRET_KEY=$(shell openssl rand -hex 20)
SUPERSET_CONTAINER_NAME=Reference-Superset
SUPERSET_ADMIN_USER_NAME=admin
SUPERSET_ADMIN_PASSWORD=admin
PROJECT_NAME=reference_superset

all:
	@echo init
	@echo up
	@echo start
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'SUPERSET_PORT=$(SUPERSET_PORT)' >> .env
	@echo 'SUPERSET_SECRET_KEY=$(SUPERSET_SECRET_KEY)' >> .env
	@echo 'SUPERSET_CONTAINER_NAME=$(SUPERSET_CONTAINER_NAME)' >> .env

start:
	docker exec -it $(SUPERSET_CONTAINER_NAME) superset fab create-admin \
	--firstname Superset \
	--lastname Admin \
	--email admin@superset.com \
	--username $(SUPERSET_ADMIN_USER_NAME) \
	--password $(SUPERSET_ADMIN_PASSWORD)
	docker exec -it $(SUPERSET_CONTAINER_NAME) superset db upgrade
	docker exec -it $(SUPERSET_CONTAINER_NAME) superset load_examples
	docker exec -it $(SUPERSET_CONTAINER_NAME) superset init

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
