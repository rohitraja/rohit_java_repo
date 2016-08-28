package com.rohit.algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;


class LengthPath{
	public int length;
	public int doubleAddJunction;
	public Queue<Integer> path = new LinkedList<Integer>();
	@Override
	public String toString() {
		return "LengthPath [length=" + length + ", doubleAddJunction="
				+ doubleAddJunction + ", path=" + path + "]";
	}
	
	
	
}

class TicketQueSortestPath {
	
	
	public static List<Integer> getEntryPoints(int queueConnections[] ){
		List<Integer> entryPoints = new ArrayList<Integer>();
		int queueLength = queueConnections.length;
		
		for(int i=0;i<queueLength;i++){
			if(queueConnections[i]==1)
				entryPoints.add(i);
		}
		
		return entryPoints;
	}
	
	public static void printentryPoint(List<Integer> entryPointList){
		for(Integer point: entryPointList){
			System.out.println(point);
		}
	}
	
	public static LengthPath getLengthPat(int[][] queuePath,int[] queueConnections,int enterance,int counterNo){
		LengthPath lengthPath = new LengthPath();
		int personInQue = 0;
		lengthPath.path.add(enterance);
		int pathfinder = enterance;
		while(enterance!=counterNo){
			personInQue = personInQue+queuePath[enterance][2];
			enterance = queuePath[enterance][1];
			if(queueConnections[enterance]>2)
			lengthPath.doubleAddJunction++;
			lengthPath.length=personInQue;
			lengthPath.path.add(enterance);
		}
		return lengthPath;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][] path = new int[7][7];
		int noJunction;//no of junction
		int noVertices;// no of vertices
		
		System.out.println("Enter no of junciton:");
		noJunction = scan.nextInt();
		System.out.println("Enter no of vertices");
		noVertices = scan.nextInt();
		
		int[][] queuePath = new int[noJunction+1][3];
		int[] queueConnections = new int [noJunction+1];
		for(int i=0;i<noVertices;i++){
			int startPoint;
			startPoint = scan.nextInt();
			queuePath[startPoint][0] = startPoint;
			queuePath[startPoint][1] = scan.nextInt();
			queuePath[startPoint][2] = scan.nextInt();
			queueConnections[queuePath[startPoint][0]]++;
			queueConnections[queuePath[startPoint][1]]++;
		}
		
		
		List<Integer> entryPoints = getEntryPoints(queueConnections);
		printentryPoint(entryPoints);
		
		
		// find path and its length from every entry point
		List<LengthPath> pathInfoList = new ArrayList<LengthPath>();
		Queue<LengthPath> pathInfoSet = new LinkedList<LengthPath>();
		LengthPath minpathInfo = getLengthPat(queuePath, queueConnections, entryPoints.get(0), noJunction);
		int minLength = minpathInfo.length ;
		//find the min lenght path
		for(Integer point:entryPoints ){
			LengthPath pathInfo = getLengthPat(queuePath, queueConnections, point, noJunction);
			if(pathInfo.length<minLength){
				minLength = pathInfo.length;
			}
			System.out.println(pathInfo);
			pathInfoList.add(pathInfo);
		}
		
		for(LengthPath lengthpath: pathInfoList ){
			if(lengthpath.length==minLength){
				System.out.println((lengthpath.length+2)*2+1);
				while(!lengthpath.path.isEmpty()){
					System.out.print(lengthpath.path.poll());
					if(!lengthpath.path.isEmpty()){
						System.out.print("->");
					}
				}
			}
		}

	}

}
