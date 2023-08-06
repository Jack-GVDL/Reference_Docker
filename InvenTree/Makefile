PROJECT_NAME=reference_inventree

all:
	@echo clear
	@echo init
	@echo up
	@echo down

clear:
	docker volume rm -f $(PROJECT_NAME)_inventree_data
	docker volume rm -f $(PROJECT_NAME)_inventree_db

init:
	docker-compose \
	--env-file .env \
	--project-name $(PROJECT_NAME) \
	run inventree-server invoke update

	docker-compose \
	--env-file .env \
	--project-name $(PROJECT_NAME) \
	run inventree-server invoke superuser

up:
	docker compose up \
	--project-name $(PROJECT_NAME) \
	-d

down:
	docker compose \
	--project-name $(PROJECT_NAME) \
	down
