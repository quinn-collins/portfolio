sudo apt update
sudo apt install node
npm install -g @vue/cli

vue create frontend --no-git

mvn clean install
mvn --projects backend spring-boot:run

npm run serve

npm install axios --save
npm install bootstrap-vue
npm install --save-dev @vue/test-utils

npm run test:unit
npm run test:e2e
npm test
npm audit
npm install -g npm@latest
npm outdated
npm update
npm install -g @vue/cli

docker build . --tag quinnc11/portfolio:latest
docker run -d -p 8088:8088 --name portfolio quinnc11/portfolio:latest
node_modules/.bin/eslint --fix --ext .js,.vue ./src
