# inventoryManagementApi

# create the following sql statements before run the application
# need to create the user and gran permission on the data base;
CREATE DATABASE IF NOT EXISTS openinvenroty;
GRANT ALL PRIVILEGES ON openinvenroty.* TO openinventoryuser@localhost IDENTIFIED BY 'openinvuser123';
FLUSH PRIVILEGES;
mysql -u openinventoryuser -p openinvuser123 openinvenroty;



How to run this application on IDE:-
pass followiing argumets as program arguments of the DailyworktrackerApplication class
--spring.profiles.active=dev




