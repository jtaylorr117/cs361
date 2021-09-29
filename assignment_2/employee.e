note
    description: "An employee of COMPANY"
    author: "natalie garcia & john taylor"
    
class
    EMPLOYEE

create
    make

feature {NONE} -- Initialization

	make(a_last_name: STRING; a_first_name: STRING; a_employeeID: INTEGER)
			-- creates new employee
		do
			last_name := a_last_name
			first_name := a_first_name
			employeeID := a_employeeID
		end

feature -- properties

	last_name: STRING
			-- last name of employee

	first_name: STRING
	 		-- the first name of employee

	employeeID: INTEGER
	 		-- ID number of employee

feature -- operations

	set_last_name(a_last_name: STRING)
			-- sets last name of employee to `a_last_name'
		do
			last_name := a_last_name
		end

	set_first_name(a_first_name: STRING)
			-- sets first name of the employee to `a_first_name'
		do
			first_name := a_first_name
		end

	set_employeeID(a_employeeID: INTEGER)
	        -- checks that the ID is not <= 0
	    require
	        invalid_ID: a_employeeID > 0
			-- sets employee id of employee to `a_employeeID'
		do
			employeeID := a_employeeID
			-- checks that the ID was assigned to variable
		ensure
		    id_set: employeeID = a_employeeID
		end

end
