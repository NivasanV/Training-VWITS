describe('Group-1',()=>{

beforeEach(()=>{
    console.log("Before each test")
})
afterEach(()=>{
    console.log("After each test")
})
afterAll(()=>{
    console.log("After all testcases")
})
it('Demo Test-1',()=>{
    console.log("In Demo Test-1")
    expect(1).toEqual(1)
})
//if you want to execute a specific test , use fit instead of it
it('Demo Test-2',()=>{
    console.log("In Demo Test-2")
})
//if you want to exclude a specific test , use xit instead of it
xit('Demo Test-3',()=>{
    console.log("In Demo Test-3")
})
})