package abstractfactory

class EmployeeServiceRestImpl: IEmployeeService {
    private val employees = listOf("REST-Alberto", "REST-Moises", "REST-Alex")
    override fun getEmployee(): List<String> {
        return this.employees
    }
}