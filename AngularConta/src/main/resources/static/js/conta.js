angular.module('demo', [])
.controller('Hello', function($scope, $http) {
	$scope.lancamentos = [];
    $http.get('http://localhost:8080/conta/lancamento').
        then(function(response) {
        		$scope.lancamentos = response.data.listaControleLancamento;
            $scope.conta = response.data.listaControleLancamento;
        });
});