<template>
  <div class="shopping-list">
    <h1>My Shopping List</h1>
    <ul> 
        <li v-for="thing in groceries" v-bind:key="thing.item" v-bind:class="{'completed' : thing.completed}">{{thing.item}}</li> 
    </ul>
  </div>
</template>

<script>
export default {
  data() {
    return{
      groceries: [
        { item: "Miller Lite",
          completed: true },
        { item: "Uno Cards",
          completed: false },
        { item: "Connect4",
          completed: true },
        { item: "Tequila",
          completed: false },
        { item: "White Claw",
          completed: false },
        { item: "Pabst Blue Ribbon",
          completed: true },
        { item: "Basil Haydens",
          completed: true },
        { item: "Jim Beam",
          completed: true },
        { item: "Guinness",
          completed: false }
      ]
    }
  }
}
</script>

<style>
.shopping-list {
  width:450px;
  background: #fff;
  margin: 50px auto;
  font-family: 'Roboto Condensed', sans-serif;
  border-radius: 10px;
}
h1 {
  background:#f2f2f2;
  color:#5c8578;
  padding:10px;
  font-size:24px;
  text-transform: uppercase;
  text-align: center;
  margin-bottom: 0px;
  border-top-left-radius: 10px;
  border-top-right-radius: 10px;
}
ul {
  list-style-type: none;
  margin:0px;
  padding:0px;
}
li {
  font-size: 24px;
  border-bottom:1px solid #f2f2f2;
  padding:10px 20px;
}
li:last-child{
  border:0px;
}
li.completed {
  text-decoration: line-through;
  color:darkgrey;
}
</style>
