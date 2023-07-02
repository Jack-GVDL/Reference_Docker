DEFAULT_PORT = 55040

all:
	@echo init
	@echo up
	@echo down

init: init-dir init-env

init-dir:
	@mkdir -p data/data

init-env:
	@rm -f .env
	@touch .env
	@echo 'LOKI_PORT=$(DEFAULT_PORT)' >> .env

up:
	docker-compose \
	--env-file .env \
	up -d

down:
	docker-compose down
