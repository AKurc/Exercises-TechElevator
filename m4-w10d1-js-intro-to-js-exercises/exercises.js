function sumDouble(x, y ){
    var x;
    var y;
    if(x === y) {
        return 2 * (x + y);
    }else {
        return x + y;
    }
}

function hasTeen(a, b, c){
    var a;
    var b;
    var c;

    if(a >= 13 && a <= 19) {
        return true;
    } if (b >= 13 && b <= 19) {
        return true;
    } if (c >= 13 && c <= 19) {
        return true;    
    }else {
        return false;
    }
}

function lastDigit(x, y) {
    var x;
    var y;
    return (x % 10 == y % 10);
}

function seeColor(color){
    var color;

    if(color.toLowerCase().startsWith("red")){
     return "red";
    }
    else if(color.toLowerCase().startsWith("blue")){
    return "blue"; 
    }      
    return "";
}

function middleThree(str){
    var str = String;
    var len = str.length / 2;

    return (str.substring(len-1,len+2));
    
    // public String middleThree(String str)
    // {
    //     int len = str.length()/2;
    //     return str.substring(len-1,len+2);
    // }
}

function frontAgain(str){
    var str = String;

    if (str.length() >= 2) {
    }else if (str.slice(0, 2).equals(str.slice-2)) {
        return true;
    }else {
        return false;
    }
}
// public boolean commonEnd(int[] a, int[] b) {
//     return (a[0] == b[0]) || (a[a.length-1] == b[b.length-1]);
// }

function alarmClock(vacation, day){
    var vacation;
    var day;

    if (vacation == true) {
        if (day >= 1 && day <=5) {
            return "10:00";
        }
        if (day == 0 || day == 6) {
            return "off";
        }
            
    } else {
        if (day >= 1 && day <=5) {
            return "7:00";
        }
        if (day == 0 || day == 6) {
            return "10:00";
        }
    }	
    return "off";
}

function makeMiddle(){
    // public String middleTwo(String str) 
    // {
    //     int half = str.length()/2-1;
    //     return str.substring(half, half+2);
    // }
}

function oddOnly(){
    // public int countOdds (int[] values) {
    //     int i, count=0;
    //     for (i=0; i<values.length; ++i) {
    //       count += values[i]%2;
    //     }
    //     return count;
    //   }
    // for(int i = 0; i < integerArray.length; i++) {
        
    //     if(integerArray[i] % 2 != 0) {
    //         aList.add(integerArray[i]);
    //     }
    // }	
    // return aList;

}

function weave(){
    // public List<Integer> interleaveLists(List<Integer> listOne, List<Integer> listTwo) {
	// 	List<Integer> wovenList = new ArrayList<>();
	
	// 	int minLength = Math.min(listOne.size(), listTwo.size());
		
	// 	for(int i = 0; i < minLength; i++) {
	// 		wovenList.add(listOne.get(i));
	// 		wovenList.add(listTwo.get(i));
	// 	}
		
	// 	return wovenList;
	// }
}

function cigarParty(){

}

function stringSplosion(){
//     Given a string, return the count of the number of times that a substring length 2 appears in the string and 
//     also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
//     last2("hixxhi") → 1
//     last2("xaxxaxaxx") → 1
//     last2("axxxaaxx") → 2
//     */
//    public int last2(String str) { //don't know how long string is- want to get last to characters//
//        if (str.length() <= 2) {
//            return 0;
//        }
//        //get the last two characters//
//        String lastTwo = str.substring(str.length() -2);
       
//        int count = 0;//need outside for loop when you're counting//
//        for(int i = 0; i < str.length() -2; i++) { //-2 b/c it tells you that you don't want to count the end substring//
//            if(str.substring(i, i + 2).equals(lastTwo)) {
//                count++;
//                }
//            }
//        return count;
//    }
}

function fizzBuzz(){
    // for (Integer i : integerArray) {
    //     if (i % 15 == 0) { 
    //         stringList.add("FizzBuzz");
    //     } else if (i % 5 == 0) {
    //         stringList.add("Buzz");
    //     } else if (i % 3 == 0) {
    //         stringList.add("Fizz");
    //     } else {
    //         stringList.add(i.toString());
    //     }
    // }
    // return stringList;
}

function countValues(){
    // Set<String> nopeRepeats = new HashSet<String>();
    // nopeRepeats.addAll(stringList);

    // List<String> distinct = new ArrayList<String>();
    // distinct.addAll(nopeRepeats);
    
    // return distinct;
}

function reverseArray(){
    // for(int i = 0; i < validData.length / 2; i++)
    // {
    //     int temp = validData[i];
    //     validData[i] = validData[validData.length - i - 1];
    //     validData[validData.length - i - 1] = temp;
    // }

    // ArrayUtils.reverse(int[] array)

    // Collections.reverse(Arrays.asList(yourArray));
}

function blackJack() {
    // public int blackjack(int a, int b) {
    //     if (a>21) a = 0;
    //     if (b>21) b = 0;
      
    //     if (a>b) {
    //       return a;
    //     else {
    //       return b;
    //     }
    //   }
}