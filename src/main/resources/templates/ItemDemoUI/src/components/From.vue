<template>
  <div class="">
    <h1>提交表单</h1>
    <form @submit.prevent="submit">
    	<input type="text" name="names" value="wxfei" v-model="user.name"/>
    	<input type="text" name="pwd" value="1123" v-model="user.pwd"/>
    	<input type="submit" name="" value="ok">
    </form>
  </div>
</template>

<script>
	export default {
		data(){
			return {
				user:{
					name:'',
					pwd:''
				}
			}
		},
		methods:{
			submit: function(){
				var names = this.user.name;
				console.log(names)
				this.$http.post('/api/receiveData',names).then(function(data){
				consolelo.log(data.bodyText)
			},function(error){
				console.log(error)
			}).bind(this)
			}
		}
	}
</script>