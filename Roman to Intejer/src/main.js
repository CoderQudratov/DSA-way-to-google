function romanToNumber(str){
   let romanList ={
    "I":1,
    "V":5,
    "X":10,
    "L":50,
    "C":100,
    "D":500,
    "M":1000
   }
   let res=0;
   for (let i = 0; i < str.length; i++) {
        if (i<str.length && romanList[str[i]]<romanList[str[i+1]]) {
            res-=romanList[str[i]];
        }else{
            res+=romanList[str[i]];
        }
    
   }
   return res;
}
let romanNumber=romanToNumber("XVI");
console.log(romanNumber);
