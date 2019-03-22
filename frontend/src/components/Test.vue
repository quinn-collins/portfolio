<template>
  <div class="test">
    <h1>Test</h1>

    <h3>Just some database interaction...</h3>

    <h4>Project</h4>
    <div
      v-for="repository in info"
      v-bind:key="repository"
      class="repository"
    >
      <br><br>
      {{ repository.name }}
      <br>
      {{ repository.updated_at }}
      <br>
      {{ repository.description }}
      <br>
      {{ repository.html_url }}

    </div>


  </div>
</template>

<script>
// import axios from 'axios'
import { AXIOS } from './http-common';

export default {
  name: 'test',
  data() {
    return {
      info: null,
    };
  },
  mounted() {
    AXIOS
      .get('/test')
      .then(response => (this.info = response.data));
  },
};
</script>


<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  h1, h2 {
    font-weight: normal;
  }

  ul {
    list-style-type: none;
    padding: 0;
  }

  li {
    display: inline-block;
    margin: 0 10px;
  }

  a {
    color: #42b983;
  }
</style>
