ELASTIC_SEARCH_PORT_1 = 55010
ELASTIC_SEARCH_PORT_2=  55011
KIBANA_PORT = 55012
PROJECT_NAME = reference_elastic-search

all:
	@echo init
	@echo up
	@echo down

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'ELASTIC_SEARCH_PORT_1=$(ELASTIC_SEARCH_PORT_1)' >> .env
	@echo 'ELASTIC_SEARCH_PORT_2=$(ELASTIC_SEARCH_PORT_2)' >> .env
	@echo 'KIBANA_PORT=$(KIBANA_PORT)' >> .env

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
