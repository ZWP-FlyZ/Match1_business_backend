<template>
  <div>
    <form @submit.prevent="submit">
      <input type="text" name="testName" v-model="user.testName"/>
      <input type="submit" value="ok" />
    </form>
  </div>
</template>

<script>
	export default {
	  data() {
	  	return {
	  		user:{
	  			testName:''
	  		}
	  	}

	  },
	  methods:{
	  	submit: function(){
	  	  console.log("user:"+this.user);
          var formData = JSON.stringify(this.user); 
		  console.log("formdata:"+formData)
		  this.$http.post('/api/receiveData',formData).then(function(data){
		    console.log(data.bodyText)
		  },function(error){
			console.log(error)
		  }).bind(this)
		}
	  }
	}
</script>
