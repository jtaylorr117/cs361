note
    description : "root class of example inheritance"
    author: "natalie garcia & john taylor"

class
    APPLICATION

inherit
    ARGUMENTS

create
    make

feature {NONE} -- Initialization

    make
            -- Run application.
            local
                c: EMPLOYEE
        do
            -- Add your code here
            io.put_string ("This is COMPANY!")
            io.put_new_line
            
            create c.make ("Doe", "Jane", 1215)
            print("Employee: "+ c.first_name + " " + c.last_name + " " +  c.employeeID.out)
            
            io.put_new_line
            io.put_string ("Changing Employee ID")
            io.put_new_line
            --Enter an invalid ID here to check precondition/postcondition 
            c.set_employeeID(12213)
            print("Employee: "+ c.first_name + " " + c.last_name + " " +  c.employeeID.out)
            
        end

end
