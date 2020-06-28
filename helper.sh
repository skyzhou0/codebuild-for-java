# 0. 
mvn package

# 1. Once the package build succeedes, we can 
cd target

# and run  
java -cp example-1.2.jar com.dataeng.ngdp.Application

# 2. Note that in Java, clean is part of the clean life cycle. run 
mvn clean

# to remove the target folder. 

# 3. In case of another mvn package, we can run 
mvn clean package

# to clean the residual build before packaging.

# 4. Install phase,
mvn clean install

# we can then check maven local repository by running:
ls ~/.m2/repository/com/dataeng/example/1.2