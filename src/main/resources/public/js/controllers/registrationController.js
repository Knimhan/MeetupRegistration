angular.module('meetupApp')
.controller('registrationController', ['$scope', '$window', 'RegistrationService', function($scope, $window, RegistrationService) {    
	
	$scope.register = function (isValid) {
		$scope.success = false;
		$scope.error = false;

        if(isValid) {
        	var addressInDTOs = [{
        		street: $scope.street,
        		city: $scope.city,
        		country: $scope.country
        	}];
        	
	        var userInDTO = {
	        	name: $scope.name,
	        	email: $scope.email,
	        	password: $scope.password,
	        	phone: $scope.phone,
	        	addressInDTOs: addressInDTOs,
	        };
	        
	        RegistrationService.save(userInDTO)
	        .$promise.then(function (data) {
            	$scope.success = true;
            	//clearForm();
        		$scope.name= '';
        		$scope.email = '';
        		$scope.password = '';
        		$scope.street = '';
        		$scope.city = '';
        		$scope.country='';
        		$scope.phone='';
            	
            })
            .catch(function(data) {
            	$scope.error = true;
            	$scope.errorMessage = data.data.message;
            });
        }
    };
    
    $scope.cancel = function () {
    	$window.location.reload();
    };

}]);