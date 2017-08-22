import Vue from 'vue'
export const APP_LIST = 'APP_LIST';//null
export const APP_ID = 'APP_ID';
export default{
	state:{
		apps:[],
		firstapp:{}
	},
	mutations:{
		[APP_LIST](state,apps){
			//sessionStorage.setItem('user',JSON.stringify(user))
			Object.assign(state.apps,apps)
		},
		[APP_ID](state,firstapp){
			Object.assign(state.firstapp,firstapp)
		}
	},
	actions:{
		[APP_LIST]({commit},apps){
			commit(APP_LIST,apps)
		},
		[APP_ID]({commit},firstapp){
			commit(APP_ID,firstapp)
		}
	}
}