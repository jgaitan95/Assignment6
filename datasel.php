<?php
	$op = $_POST["op"];
        if($op == "uploadEmps"){
            $EmployeeList = $_POST["EmployeeList"];
            $cmd = "java -classpath /var/www/cgi-bin/:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar assignment6.Server $op $EmployeeSchedule";
        } else {
            $skills = $_POST["skills"];
            $day = $_POST["day"];
            $hour = $_POST["hour"];
            $cmd = "java -classpath /var/www/cgi-bin/:/var/www/cgi-bin/mysql-connector-java-5.1.23-bin.jar assignment6.Server $op $skills $day $hour";
}
	$str = shell_exec($cmd);
        print($str);
?>
