# credential
# username: $(MINIO_ACCESS_KEY)
# password: $(MINIO_SECRET_KEY)

ACCESS_KEY = $(shell openssl rand -hex 20)
SECRET_KEY = $(shell openssl rand -hex 20)

init: init-dir init-env

init-dir:
	@mkdir -p data/data
	@mkdir -p data/config

init-env:
	@rm -f .env
	@touch .env
	@echo 'MINIO_ACCESS_KEY=$(ACCESS_KEY)' >> .env
	@echo 'MINIO_SECRET_KEY=$(SECRET_KEY)' >> .env

up:
	docker-compose \
	--env-file .env \
	up -d

down:
	docker-compose down
