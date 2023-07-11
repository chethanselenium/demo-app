def genReports(String stage,String job1,String build_num,String burl, String job2){
    echo "${stage} ${job1}   ${build_num}  ${burl}  ${job2}"
}
def printMessage(String stage) {
  a='Hello world'
  echo "${a} ${stage}"
}

return this