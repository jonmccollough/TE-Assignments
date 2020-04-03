<template>
  <div>
    <a
      href="#"
      v-on:click.prevent="showCreateActorForm = true"
      v-if="showCreateActorForm === false"
    >Show Form</a>

    <form v-if="showCreateActorForm === true" v-on:submit.prevent="addNewActor">
      <div class="form-element">
        <label for="firstName">First Name:</label>
        <input id="firstName" type="text" v-model="newActor.firstName">
      </div>
      <div class="form-element">
        <label for="lastName">Last Name:</label>
        <input id="lastName" type="text" v-model="newActor.lastName">
      </div>
      <button>Submit</button>
      <button v-on:click.prevent="resetForm" type="cancel">Cancel</button>
    </form>

    <p v-for="actor in actors" v-bind:key="actor.actorId">actor information
            {{actor.actorId}}, {{actor.firstName}},{{actor.lastName}}
        </p>
    </div>
</template>

<script>
import axios from 'axios';

export default {
    name: 'Actor',

    data() {
        return {
            showCreateActorForm: false,
            newActor: {},
            actors: [ 
                {
                    "actorId": 1,
                    "firstName": "PENELOPE",
                    "lastName": "GUINESS"
                }
            ],
        }
    },
    created() {
        this.loadActorList();
    },
    methods: {
        resetForm() {
            this.showCreateActorForm = false;
            this.newActor = {};
        },
        addNewActor() {
            axios
            .post('http://localhost:8080/60-Vue-Axios-student-lecture/api/actors',{
                firstName: this.newActor.firstName,
                lastName: this.newActor.lastName
            })
            .then(() => {
               this.resetForm();
               this.loadActorList();
            })
            .catch(error => {
               console.log('there was an error ' + error.response);
            })
        },
        loadActorList() {
            axios
            .get('http://localhost:8080/60-Vue-Axios-student-lecture/api/actors')
            .then(response => {
                this.actors = response.data;
            })
            .catch(error => {
                console.log('there was an error ' + error.response);
            })
        }
    }
    
    
}
</script>