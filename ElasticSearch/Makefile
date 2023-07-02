ELASTIC_SEARCH_PORT_1 = 55010
ELASTIC_SEARCH_PORT_2=  55011
KIBANA_PORT = 55012
COMPOSE_PROJECT_NAME = reference-elastic-search

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
	@echo 'COMPOSE_PROJECT_NAME=$(COMPOSE_PROJECT_NAME)' >> .env

up:
	docker-compose \
	--env-file .env \
	up -d

down:
	docker-compose down
