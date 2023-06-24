clear:
	docker volume rm -f inventree-production_inventree_data
	docker volume rm -f inventree-production_inventree_db

init:
	docker compose run inventree-server invoke update
	docker compose run inventree-server invoke superuser

up:
	docker compose up -d

down:
	docker compose down
