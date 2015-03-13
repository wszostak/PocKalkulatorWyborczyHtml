app.service('resources', ['$http', function ($http) {

    this.getGeographyTaxonomy = function () {
        return $http({
            url: "teryt.json"
        });
    };

    this.loadPollingStationsData = function() {
        return $http.get("106101.xml").then(function (result) {
            var xml = result.data;

            return {
                candidates: OpenPKW.KlkParser.loadCandidates(xml),
                pollingStationsData: OpenPKW.KlkParser.loadPollingStationsData(xml)
            };
        });
    }

}]);