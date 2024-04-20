<script setup>
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <div id="main">
      <nav> |
        <RouterLink :to="{name: 'home'}">Home</RouterLink> |
        <RouterLink :to="{name: 'about'}">About</RouterLink> |
        <RouterLink :to="{name: 'pokemon'}">Pokemon</RouterLink> |
      </nav>
      <RouterView />
    </div>

  
</template>

<style scoped>
  #main {
    text-align: center;
    max-width: 800px;
    margin: 60px auto 0 auto;
  }
</style>
