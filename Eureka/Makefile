build:
	docker build -f ./docker/dockerfile -t eureka-server .

up:
	docker-compose \
	--env-file .env \
	up -d

down:
	docker-compose down
