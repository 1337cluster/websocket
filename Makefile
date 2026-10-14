all: up

up:
	docker-compose up --build

down:
	docker-compose down

# clean:
# 	docker-compose down --rmi all -v

clean:
	docker-compose down -v
	rm -rf backend/target    # Zidi had sstar bach tms7i target

fclean: clean
	docker system prune -af

re: clean all
.PHONY: all up down clean re