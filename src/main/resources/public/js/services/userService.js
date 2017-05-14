angular.module('meetupApp')
.factory('RegistrationService',
	    function ($resource) {
	        "use strict";
	        return {
	            "save": function (data) {
	                var ret, restResource;

	                restResource = $resource('/api/users', {}, {
	                    "save": {
	                        method: 'POST'
	                    }
	                });
	                ret = restResource.save(data);
	                return ret;
	            }
	        };
	    });
