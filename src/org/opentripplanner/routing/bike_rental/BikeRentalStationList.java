/* This program is free software: you can redistribute it and/or
 modify it under the terms of the GNU Lesser General Public License
 as published by the Free Software Foundation, either version 3 of
 the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>. */

package org.opentripplanner.routing.bike_rental;

import java.util.ArrayList;
import java.util.List;

//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlElements;
//import javax.xml.bind.annotation.XmlRootElement;

import org.opentripplanner.routing.bike_rental.BikeRentalStation;

//@XmlRootElement(name="BikeRentalStationList")
public class BikeRentalStationList {
//    @XmlElements(value = { @XmlElement(name="station") })
    public List<BikeRentalStation> stations = new ArrayList<BikeRentalStation>();
}
