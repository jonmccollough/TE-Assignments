<template>
  <div id="app">
    <actor></actor>
  </div>
</template>

<script>
import Actor from './components/Actor.vue';

export default {
  name: 'App',
  components: {
    Actor
  },
  
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
