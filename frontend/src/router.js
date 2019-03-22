import Vue from 'vue';
import Router from 'vue-router';
import Hello from '@/components/Hello.vue';
import Service from '@/components/Service.vue';
import Bootstrap from '@/components/Bootstrap.vue';
import User from '@/components/User.vue';
import Test from '@/components/Test.vue';

Vue.use(Router);

export default new Router({
  routes: [
    {
      path: '/',
      name: 'hello',
      component: Hello,
    },
    {
      path: '/callservice',
      name: 'Service',
      component: Service,
    },
    {
      path: '/bootstrap',
      name: 'Bootstrap',
      component: Bootstrap,
    },
    {
      path: '/user',
      name: 'User',
      component: User,
    },
    {
      path: '/test',
      name: 'Test',
      component: Test,
    },
  ],
});
