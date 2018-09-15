package com.dzj.command.mode;
/**
 * 大家看这个抽象类 命令语气，给出命令，然后由相关的人员执行
 * */
public abstract class Group {
       //甲乙双方分开办公，如果你要和某个组讨论，你首先要找到这个组
	   public abstract void find();
	   //被要求增加功能
	   public abstract void add();
	   //被要求删除功能
	   public abstract void delete();
	   //被要求修改功能
	   public abstract void change();
	   //被要求给出所有的变更计划
	   public abstract void plan();
	   
	   //优化命令模式
	   public void rollBack(){
		   //根据日志进行回滚
	   }
}
