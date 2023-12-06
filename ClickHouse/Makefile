CLICKHOUSE_PORT_HTTP=55063
CLICKHOUSE_PORT_NATIVE_CLIENT=55064
CLICKHOUSE_CONTAINER_NAME=Reference-ClickHouse
PROJECT_NAME=reference_mailhog

all:
	@echo init
	@echo up
	@echo down
	@echo test
	@echo info
	@echo clean

info:
	@echo '$(CLICKHOUSE_CONTAINER_NAME)'

init: init-env

init-env:
	@rm -f .env
	@touch .env
	@echo 'CLICKHOUSE_PORT_HTTP=$(CLICKHOUSE_PORT_HTTP)' >> .env
	@echo 'CLICKHOUSE_PORT_NATIVE_CLIENT=$(CLICKHOUSE_PORT_NATIVE_CLIENT)' >> .env
	@echo 'CLICKHOUSE_CONTAINER_NAME=$(CLICKHOUSE_CONTAINER_NAME)' >> .env

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

test:
	echo 'SELECT version()' | curl 'http://localhost:$(CLICKHOUSE_PORT_HTTP)/' --data-binary @-

clean:
	docker volume rm $(PROJECT_NAME)_Reference_ClickHouse_Db
